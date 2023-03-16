.class public final synthetic Lb4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly3/j;


# instance fields
.field public final synthetic a:Lz3/s;


# direct methods
.method public synthetic constructor <init>(Lz3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb4/b;->a:Lz3/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lb4/b;->a:Lz3/s;

    check-cast p1, Lb4/e;

    check-cast p2, Lt4/j;

    sget v1, Lb4/d;->n:I

    invoke-virtual {p1}, Lz3/c;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lb4/a;

    invoke-virtual {p1, v0}, Lb4/a;->m0(Lz3/s;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lt4/j;->c(Ljava/lang/Object;)V

    return-void
.end method
