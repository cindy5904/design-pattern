package org.example.Demo;

public class TraficInfo {
    private int densite;
    private Boolean accident;
    private String conditionMeteo;

    private TraficInfo(Builder builder) {
        this.densite = builder.densite;
        this.accident = builder.accident;
        this.conditionMeteo = builder.conditionMeteo;
    }
    public int getDensite() {
        return densite;
    }

    public void setDensite(int densite) {
        this.densite = densite;
    }

    public Boolean getAccident() {
        return accident;
    }

    public void setAccident(Boolean accident) {
        this.accident = accident;
    }

    public String getConditionMeteo() {
        return conditionMeteo;
    }

    public void setConditionMeteo(String conditionMeteo) {
        this.conditionMeteo = conditionMeteo;
    }

    public static class Builder {
        private int densite;
        private Boolean accident;
        private String conditionMeteo;

        public Builder densite(int densite) {
            this.densite = densite;
            return this;
        }

        public Builder accident(Boolean accident) {
            this.accident = accident;
            return this;
        }

        public TraficInfo build(){
            return  new TraficInfo(this);
        }

    }
}
