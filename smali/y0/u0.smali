.class public Ly0/u0;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Ljava/lang/String;)Ljava/util/UUID;
    .locals 0

    invoke-static {p0}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    move-result-object p0

    invoke-static {p0}, Ly0/p0;->g(Ljava/util/UUID;)Ljava/util/UUID;

    move-result-object p0

    return-object p0
.end method
