fun main() {
    var mContainer = Container(4)
    println("Container ${mContainer.getvalue()}")
    mContainer.setValue(2);
    println("Container ${mContainer.getvalue()}")
}

class Container<T> (var data : T){

    fun getvalue(): T{
        return data;
    }

    fun setValue(value:T){
        this.data = value;
    }

}