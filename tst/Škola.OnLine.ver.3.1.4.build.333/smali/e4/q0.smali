.class public abstract Le4/q0;
.super Lq4/b;
.source ""

# interfaces
.implements Le4/r0;


# direct methods
.method public static e(Landroid/os/IBinder;)Le4/r0;
    .locals 2

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string v0, "com.google.android.gms.common.internal.IGoogleCertificatesApi"

    invoke-interface {p0, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Le4/r0;

    if-eqz v1, :cond_1

    check-cast v0, Le4/r0;

    return-object v0

    :cond_1
    new-instance v0, Le4/p0;

    invoke-direct {v0, p0}, Le4/p0;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
