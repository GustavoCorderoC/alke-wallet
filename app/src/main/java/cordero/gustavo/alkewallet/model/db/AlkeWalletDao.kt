package cordero.gustavo.alkewallet.model.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Dao que va a implementar todos los metodos que vamos a usar en esta app
 */
@Dao
interface AlkeWalletDao {

    //Metodo para insertar toda la data
    @Insert
    fun insertarData(alkewallet: List<AlkeWalletEntidad>)

    //Metodo para traer toda la informacion
    @Query("Select * from alkewallet")
    fun obeterEmpresasDB(): List<AlkeWalletEntidad>

    //Metodo para boorar toda la data
    @Query("DELETE FROM alkewallet")
    fun borrarDB()
}
