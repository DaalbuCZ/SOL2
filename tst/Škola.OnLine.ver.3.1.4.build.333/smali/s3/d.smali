.class public final synthetic Ls3/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf5/l;


# instance fields
.field public final synthetic n:Ls3/m;


# direct methods
.method public synthetic constructor <init>(Ls3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/d;->n:Ls3/m;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Ls3/d;->n:Ls3/m;

    check-cast p1, Lx1/n1;

    invoke-static {v0, p1}, Ls3/m;->n(Ls3/m;Lx1/n1;)Z

    move-result p1

    return p1
.end method
