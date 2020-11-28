package com.example.kataloglaptop;

    public class Laptop {
        private String merk;
        private String type;
        private String deskripsi;
        private int drawableRes;

        public Laptop(String merk, String type, String deskripsi, int drawableRes) {
            this.merk = merk;
            this.type = type;
            this.deskripsi = deskripsi;
            this.drawableRes = drawableRes;
        }

        public String getMerk() {
            return merk;
        }

        public void setMerk(String merk) {
            this.merk = merk;
        }

        public String getType() { return type; }

        public void setType(String type) { this.type = type; }

        public String getDeskripsi() {
            return deskripsi;
        }

        public void setDeskripsi(String deskripsi) {
            this.deskripsi = deskripsi;
        }

        public int getDrawableRes() {
            return drawableRes;
        }

        public void setDrawableRes(int drawableRes) {
            this.drawableRes = drawableRes;
        }
    }


