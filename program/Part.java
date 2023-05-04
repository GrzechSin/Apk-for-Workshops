package pl.sda.pol141.program;


    public class Part {
        private String name;
        private String number;
        private double cost;

        public Part(String name, String number, double cost) {
            this.name = name;
            this.number = number;
            this.cost = cost;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }
    }

