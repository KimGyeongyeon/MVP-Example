package com.example.contractexample

class MainPresenter(val mainView: MainContract.View<MainContract.Presenter>) : MainContract.Presenter {

    // Model - Presenter 간의 순환 참조를 끊으려면 Observer 패턴을 사용한다.
    val model = Data

    override fun start() {
        /**
         * 구글 샘플에서는 Fragment의 onResume()에서 호출되게 만들었다.
         * */
    }

    override fun growNumber() {
        model.number += 1
        mainView.showData(model.number)
    }
}