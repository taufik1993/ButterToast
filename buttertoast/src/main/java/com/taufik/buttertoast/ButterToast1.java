package com.taufik.buttertoast;

import android.content.Context;
import android.widget.Toast;

public class ButterToast1 {
    private String message;
    private int resourceId;
    private Context context;

    private ButterToast1(final Builder builder) {
        message = builder.message;
        resourceId = builder.resourceId;
        context = builder.context;
    }

    public ButterToast1 showToast(){
        Toast.makeText(context,message,Toast.LENGTH_SHORT).show();
        return this;
    }

    public static class Builder {
        private String message;
        private int resourceId;
        private Context context;

        public Builder(Context context) {
            this.context = context;
        }

        public Builder setMessage(final String message) {
            this.message = message;
            return this;
        }

        public Builder setMessage(final int resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public ButterToast1 create() {
            return new ButterToast1(this).showToast();
        }
    }
}
