package com.example.myweather2.db;


import org.litepal.crud.DataSupport;

public class Province extends DataSupport {
        private int id;
        private String provinceName;
        private int provinceCode;

   /* public Province(int id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }*/

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getProvinceCode() {
            return provinceCode;
        }

        public void setProvinceCode(int provinceCode) {
            this.provinceCode = provinceCode;
        }

        public String getProvinceName() {
            return provinceName;
        }

        public void setProvinceName(String provinceName) {
            this.provinceName = provinceName;
        }
    }

