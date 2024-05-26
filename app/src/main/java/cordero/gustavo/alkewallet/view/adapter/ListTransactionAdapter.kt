package cordero.gustavo.alkewallet.view.adapter

import android.content.ClipData
import android.media.RouteListingPreference.Item
import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.ads.mediationtestsuite.viewmodels.ItemViewHolder
import cordero.gustavo.alkewallet.R
import cordero.gustavo.alkewallet.model.Transaction

class ListTransactionAdapter (private val ListaTransacciones: List<Transaction>) :
    RecyclerView.Adapter<ListTransactionAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){


        val itemName: TextView = view.findViewById(R.id.recycler_list_user)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_home_page,parent,false)
        return Transaction( name="String",lastName="String",date="String",amount= "String",imgUrl= "String";?)
    }

    override fun getItemCount(): Int {
       return ListaTransacciones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemName.text = ListaTransacciones [position].name
    }




}