.class public final Lv4/j;
.super Lv4/a;
.source ""

# interfaces
.implements Lv4/l;


# direct methods
.method constructor <init>(Landroid/os/IBinder;)V
    .locals 1

    const-string v0, "com.google.android.play.core.appupdate.protocol.IAppUpdateService"

    invoke-direct {p0, p1, v0}, Lv4/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final R(Ljava/lang/String;Landroid/os/Bundle;Lv4/n;)V
    .locals 1

    invoke-virtual {p0}, Lv4/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lv4/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lv4/i;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x2

    invoke-virtual {p0, p1, v0}, Lv4/a;->e(ILandroid/os/Parcel;)V

    return-void
.end method

.method public final Y(Ljava/lang/String;Landroid/os/Bundle;Lv4/n;)V
    .locals 1

    invoke-virtual {p0}, Lv4/a;->a()Landroid/os/Parcel;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    invoke-static {v0, p2}, Lv4/i;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    invoke-static {v0, p3}, Lv4/i;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/4 p1, 0x3

    invoke-virtual {p0, p1, v0}, Lv4/a;->e(ILandroid/os/Parcel;)V

    return-void
.end method
