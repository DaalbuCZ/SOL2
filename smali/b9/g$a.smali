.class public final Lb9/g$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static a(Lb9/g;Lb9/g;)Lb9/g;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lk9/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lb9/h;->n:Lb9/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lb9/g$a$a;->o:Lb9/g$a$a;

    invoke-interface {p1, p0, v0}, Lb9/g;->S(Ljava/lang/Object;Lj9/p;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lb9/g;

    :goto_0
    return-object p0
.end method
