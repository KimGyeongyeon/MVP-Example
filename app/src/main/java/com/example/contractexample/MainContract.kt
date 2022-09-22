package com.example.contractexample

interface MainContract {

    /**
     * Activity가 상속받을 인터페이스.
     * 상속받을 때는 MainContract.View<MainContract.Presenter>를 상속받아야하지만,
     * presenter에는 자식 클래스인 MainPresenter를 연결한다.
     *
     */
    interface View<T>{
        var presenter : T
        fun showData(data : Int)
    }

    /**
     * class MainPresenter가 상속받게 될 인터페이스.
     * */
    interface Presenter{
        fun start()
        fun growNumber()
    }
}