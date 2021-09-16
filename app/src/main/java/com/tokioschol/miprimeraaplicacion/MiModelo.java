package com.tokioschol.miprimeraaplicacion;

import android.os.Parcel;
import android.os.Parcelable;

public class MiModelo implements Parcelable {
    private String nombre;
    private String apellidoK;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoK() {
        return apellidoK;
    }

    public void setApellidoK(String apellidoK) {
        this.apellidoK = apellidoK;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeString(this.apellidoK);
        dest.writeInt(this.edad);
    }

    public void readFromParcel(Parcel source) {
        this.nombre = source.readString();
        this.apellidoK = source.readString();
        this.edad = source.readInt();
    }

    public MiModelo() {
    }

    protected MiModelo(Parcel in) {
        this.nombre = in.readString();
        this.apellidoK = in.readString();
        this.edad = in.readInt();
    }

    public static final Parcelable.Creator<MiModelo> CREATOR = new Parcelable.Creator<MiModelo>() {
        @Override
        public MiModelo createFromParcel(Parcel source) {
            return new MiModelo(source);
        }

        @Override
        public MiModelo[] newArray(int size) {
            return new MiModelo[size];
        }
    };
}
