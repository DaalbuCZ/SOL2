.class public abstract Lx1/j3;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lx1/h;


# static fields
.field static final n:Ljava/lang/String;

.field public static final o:Lx1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lx1/h$a<",
            "Lx1/j3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lu3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lx1/j3;->n:Ljava/lang/String;

    sget-object v0, Lx1/i3;->a:Lx1/i3;

    sput-object v0, Lx1/j3;->o:Lx1/h$a;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lx1/j3;
    .locals 0

    invoke-static {p0}, Lx1/j3;->b(Landroid/os/Bundle;)Lx1/j3;

    move-result-object p0

    return-object p0
.end method

.method private static b(Landroid/os/Bundle;)Lx1/j3;
    .locals 3

    sget-object v0, Lx1/j3;->n:Ljava/lang/String;

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    sget-object v0, Lx1/w3;->t:Lx1/h$a;

    :goto_0
    invoke-interface {v0, p0}, Lx1/h$a;->a(Landroid/os/Bundle;)Lx1/h;

    move-result-object p0

    check-cast p0, Lx1/j3;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown RatingType: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object v0, Lx1/s3;->t:Lx1/h$a;

    goto :goto_0

    :cond_2
    sget-object v0, Lx1/w2;->r:Lx1/h$a;

    goto :goto_0

    :cond_3
    sget-object v0, Lx1/q1;->t:Lx1/h$a;

    goto :goto_0
.end method
