.class public final Lr9/r;
.super Lr9/r1;
.source ""

# interfaces
.implements Lr9/q;


# instance fields
.field public final r:Lr9/s;


# direct methods
.method public constructor <init>(Lr9/s;)V
    .locals 0

    invoke-direct {p0}, Lr9/r1;-><init>()V

    iput-object p1, p0, Lr9/r;->r:Lr9/s;

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lr9/r;->r:Lr9/s;

    invoke-virtual {p0}, Lr9/v1;->D()Lr9/w1;

    move-result-object v0

    invoke-interface {p1, v0}, Lr9/s;->y(Lr9/d2;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lr9/r;->C(Ljava/lang/Throwable;)V

    sget-object p1, Ly8/s;->a:Ly8/s;

    return-object p1
.end method

.method public getParent()Lr9/p1;
    .locals 1

    invoke-virtual {p0}, Lr9/v1;->D()Lr9/w1;

    move-result-object v0

    return-object v0
.end method

.method public l(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lr9/v1;->D()Lr9/w1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lr9/w1;->J(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
