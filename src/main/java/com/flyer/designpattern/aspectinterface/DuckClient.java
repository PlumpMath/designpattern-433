package com.flyer.designpattern.aspectinterface;


public class DuckClient {

    /**
     * 一旦有变化或者扩展就需要打开这段代码进行修改，违反了对修改封闭的原则
     * @param type
     * @return
     */
    public Duck createDuck(String type) {
        Duck duck = null;
        switch (type) {
        case "picnic":
            duck = new MallardDuck();
            break;
        case "hunting":
            duck = new DecoyDuck();
            break;
        case "inBathTub":
            duck = new RubberDuck();
            break;
        default:
            //nothing to do

        }
        return duck;
    }
}
