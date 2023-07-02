.class public final synthetic Lg4/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ld4/j;


# instance fields
.field public final synthetic a:Le4/s;


# direct methods
.method public synthetic constructor <init>(Le4/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg4/b;->a:Le4/s;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lg4/b;->a:Le4/s;

    check-cast p1, Lg4/e;

    check-cast p2, Ly4/j;

    sget v1, Lg4/d;->n:I

    invoke-virtual {p1}, Le4/c;->D()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Lg4/a;

    invoke-virtual {p1, v0}, Lg4/a;->m0(Le4/s;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Ly4/j;->c(Ljava/lang/Object;)V

    return-void
.end method
