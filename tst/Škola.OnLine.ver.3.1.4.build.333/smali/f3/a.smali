.class public final Lf3/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf3/k;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lf3/h;Lf3/g;)Lt3/j0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf3/h;",
            "Lf3/g;",
            ")",
            "Lt3/j0$a<",
            "Lf3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf3/j;

    invoke-direct {v0, p1, p2}, Lf3/j;-><init>(Lf3/h;Lf3/g;)V

    return-object v0
.end method

.method public b()Lt3/j0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt3/j0$a<",
            "Lf3/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf3/j;

    invoke-direct {v0}, Lf3/j;-><init>()V

    return-object v0
.end method
