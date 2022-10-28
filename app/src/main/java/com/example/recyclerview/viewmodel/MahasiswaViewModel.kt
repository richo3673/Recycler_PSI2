package com.example.recyclerview.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerview.model.MahasiswaModel

class MahasiswaViewModel : ViewModel() {

    var mahasiswaListData: MutableLiveData<ArrayList<MahasiswaModel>>? = null
    val mahasiswaList = ArrayList<MahasiswaModel>()

    //GET LIVEDATA
    internal fun getMahasiswaList(): MutableLiveData<ArrayList<MahasiswaModel>> {
        if (mahasiswaListData == null) {
            mahasiswaListData = MutableLiveData()
            createMahasiswa()
        }
        return mahasiswaListData as MutableLiveData<ArrayList<MahasiswaModel>>
    }

    //ADD MODEL TO LIVEDATA
    private fun addData(array: ArrayList<MahasiswaModel>) {
        mahasiswaListData!!.value = array
    }

    //CREATE MODEL
    fun addMahasiswa(nama: String, nim: String, stream:String, foto:String) {
        mahasiswaList.add(MahasiswaModel(nama, nim, stream, foto))
        addData(mahasiswaList)
    }


    //CREATE DUMMY DATA
    private fun createMahasiswa() {
        addMahasiswa("Richo Wijaya Putra", "205150200111018", "Full Stack", "image_0")
        addMahasiswa("Nelson Alfons Abilo", "205150200111017", "Full Stack", "image_2")
        addMahasiswa("Auryn Seanita", "205150201111011", "Interactive Media", "image_1")
        addMahasiswa("Billy Kurnianda", "205150201111014", "Interactive Media", "image_3")
    }
}