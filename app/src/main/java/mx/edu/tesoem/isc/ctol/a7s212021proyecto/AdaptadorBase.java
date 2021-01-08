package mx.edu.tesoem.isc.ctol.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorBase extends BaseAdapter {

    List<Datos> datos = new ArrayList<>();
    Context context;

    public AdaptadorBase(List<Datos> datos, Context context) {
        this.datos = datos;
        this.context = context;
    }

    @Override
    public int getCount() {
        return datos.size();
    }

    @Override
    public Object getItem(int position) {
        return datos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.activity_elemento, null);
        }
        TextView lblnombre = convertView.findViewById(R.id.elblNombre);
        Datos dato = datos.get(position);
        lblnombre.setText(dato.getNombre());
        return convertView;
    }
}
