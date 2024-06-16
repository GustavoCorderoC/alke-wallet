package cordero.gustavo.alkewallet.model.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "alkewallet")
data class AlkeWalletEntidad(
//aca van los campos que voy a guardar en la base de datos

@PrimaryKey(autoGenerate = true)
val id: Int = 0,
val id_api: Int,
val nombre_empresa: String,
val url_logo: String,
val ubicacion_empresa: String,
val fecha_fundacion: String
){
    override fun toString(): String {
        return this.nombre_empresa
    }
}