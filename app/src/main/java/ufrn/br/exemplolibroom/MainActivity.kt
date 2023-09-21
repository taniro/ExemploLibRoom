package ufrn.br.exemplolibroom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import ufrn.br.exemplolibroom.database.AppDatabase
import ufrn.br.exemplolibroom.model.Carro

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "banco_aula.sqlite"
        ).allowMainThreadQueries().build()

        val c = Carro(2000, "Corsa", "Vermelho")

        db.carroDao().inserir(c)
    }
}