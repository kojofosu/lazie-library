package com.mcdev.lazielibrary;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;

public class Copie {


    public static void copyWithToast(Context context, String label, String textToCopy, String toastMessage){
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText(label, textToCopy);
        assert clipboard != null;
        clipboard.setPrimaryClip(clipData);

        /*toast*/
        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }

    public static void copy(Context context, String label, String textToCopy){
        ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clipData = ClipData.newPlainText(label, textToCopy);
        assert clipboard != null;
        clipboard.setPrimaryClip(clipData);
    }

    public static class Builder{
        private Context context;

        private String label;
        private String textToCopy;
        private String toastMessage;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder copy(String label, String textToCopy){
            this.label = label;
            this.textToCopy = textToCopy;
            return this;
        }

        public Builder makeToast(String toastMessage) {
            this.toastMessage = toastMessage;
            return this;
        }

        public void build() {
            if (label != null && textToCopy != null) {
                ClipboardManager clipboard = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clipData = ClipData.newPlainText(label, textToCopy);
                assert clipboard != null;
                clipboard.setPrimaryClip(clipData);
            }

            if (toastMessage != null) {
                Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
            }
        }
    }

    /*copy with toast*/
    private static void toast(Context context, String toastMessage) {
        Toast.makeText(context, "copied", Toast.LENGTH_SHORT).show();
    }
}
