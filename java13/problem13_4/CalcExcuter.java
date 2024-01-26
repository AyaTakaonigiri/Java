package java13.problem13_4;

public class CalcExcuter implements CalcAddSub, CalcMultiDiv {
    
    //インターフェイスのCalcAddSubのメソッドをオーバライド
    @Override
    public int dispAdd(int num1, int num2) {
        return (num1 + num2);
    }

    @Override
    public int dispSub(int num1, int num2) {
        return (num1 - num2);
    }

    ////インターフェイスのCalcMultiDivのメソッドをオーバライド
    @Override
    public int dispMulti(int num1, int num2) {
        return (num1 * num2);
    }

    @Override
    public int dispDiv(int num1, int num2) {
        return (num1 / num2);
    }
}
