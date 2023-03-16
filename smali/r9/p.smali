.class public final Lr9/p;
.super Lr9/r1;
.source ""


# instance fields
.field public final r:Lr9/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr9/l<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lr9/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr9/l<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lr9/r1;-><init>()V

    iput-object p1, p0, Lr9/p;->r:Lr9/l;

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lr9/p;->r:Lr9/l;

    invoke-virtual {p0}, Lr9/v1;->D()Lr9/w1;

    move-result-object v0

    invoke-virtual {p1, v0}, Lr9/l;->z(Lr9/p1;)Ljava/lang/Throwable;

    move-result-object v0

    invoke-virtual {p1, v0}, Lr9/l;->I(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr9/p;->C(Ljava/lang/Throwable;)V

    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method
