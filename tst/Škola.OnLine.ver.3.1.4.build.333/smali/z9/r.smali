.class public final Lz9/r;
.super Lz9/r1;
.source ""

# interfaces
.implements Lz9/q;


# instance fields
.field public final r:Lz9/s;


# direct methods
.method public constructor <init>(Lz9/s;)V
    .locals 0

    invoke-direct {p0}, Lz9/r1;-><init>()V

    iput-object p1, p0, Lz9/r;->r:Lz9/s;

    return-void
.end method


# virtual methods
.method public C(Ljava/lang/Throwable;)V
    .locals 1

    iget-object p1, p0, Lz9/r;->r:Lz9/s;

    invoke-virtual {p0}, Lz9/v1;->D()Lz9/w1;

    move-result-object v0

    invoke-interface {p1, v0}, Lz9/s;->x(Lz9/d2;)V

    return-void
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lz9/r;->C(Ljava/lang/Throwable;)V

    sget-object p1, Lg9/s;->a:Lg9/s;

    return-object p1
.end method

.method public getParent()Lz9/p1;
    .locals 1

    invoke-virtual {p0}, Lz9/v1;->D()Lz9/w1;

    move-result-object v0

    return-object v0
.end method

.method public n(Ljava/lang/Throwable;)Z
    .locals 1

    invoke-virtual {p0}, Lz9/v1;->D()Lz9/w1;

    move-result-object v0

    invoke-virtual {v0, p1}, Lz9/w1;->I(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method
