package com.main.bexperiment.opleidingen;

public enum OpleidingenData implements OpleidingenListener {

    INFORMATICA() {
        @Override
        public String getDate() {
            return "25-02-2019 16:50";
        }

        @Override
        public String[] getContent() {
            return new String[] {
                    "Informatica is a great study",
                    "And its very easy to follow."
            };
        }
    }
}
