package com.example.myfirstlibrary;

class IcndbJoke {
    private String type;
    private Joke value;

    public String getJoke(){
        return value.getJoke();
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setValue(Joke value) {
        this.value = value;
    }
    public Joke getValue(){
        return value;
    }

    private static class Joke {
        private int ID;
        private String joke;
        private String[] categories;

        public int getID() {
            return ID;
        }

        public void setID(int ID) {
            this.ID = ID;
        }

        public String getJoke() {
            return joke;
        }

        public void setJoke(String joke) {
            this.joke = joke;
        }

        public String[] getCategories() {
            return categories;
        }

        public void setCategories(String[] categories) {
            this.categories = categories;
        }
    }

}
