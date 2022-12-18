package OOP_Praktika;

public class Milk extends Produkt{
        public Milk(String name, double price, String firm, Integer fatContent) {
            super(name, price);
            this.setfirm(firm);
            this.setFatContent(fatContent);
        }
        private String firm;
        private Integer fatContent;

        public String getfirm() {
            return getFirm();
        }
        private void setfirm(String firm){
            this.setFirm(firm);
        }

        public String toString(){
            return String.format("%s - %s; Fat Content - %s ", super.toString(), getFirm(), getFatContent());
        }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public Integer getFatContent() {
        return fatContent;
    }

    public void setFatContent(Integer fatContent) {
        this.fatContent = fatContent;
    }
}
