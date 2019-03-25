package com.main.bexperiment.opleidingen;

public enum OpleidingenData implements OpleidingenListener {

    INFORMATICA() {
        @Override
        public String getDate() {
            return "25-05-2019 16:50";
        }

        @Override
        public String[] getContent() {
            return new String[] {
                    "Informatica is a great study",
                    "And its very easy to follow."
            };
        }
    },
    MEDIA_TECHNOLGY() {
        @Override
        public String getDate() {
            return "25-06-2020 18:50";
        }

        @Override
        public String[] getContent() {
            return new String[] {
                    "Media technology let's go!"
            };
        }
    }
}
