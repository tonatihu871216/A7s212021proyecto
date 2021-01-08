package mx.edu.tesoem.isc.ctol.proyecto;

import android.os.Parcel;
import android.os.Parcelable;

public class DatosParcelable implements Parcelable {
    String matricula, nombre, correo, promedio;

    public DatosParcelable(String matricula, String nombre, String correo, String promedio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.correo = correo;
        this.promedio = promedio;
    }

    protected DatosParcelable(Parcel in) {
        matricula = in.readString();
        nombre = in.readString();
        correo = in.readString();
        promedio = in.readString();
    }

    public static final Creator<DatosParcelable> CREATOR = new Creator<DatosParcelable>() {
        @Override
        public DatosParcelable createFromParcel(Parcel in) {
            return new DatosParcelable(in);
        }

        @Override
        public DatosParcelable[] newArray(int size) {
            return new DatosParcelable[size];
        }
    };

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPromedio() {
        return promedio;
    }

    public void setPromedio(String promedio) {
        this.promedio = promedio;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(matricula);
        dest.writeString(nombre);
        dest.writeString(correo);
        dest.writeString(promedio);
    }
}
