.class public final synthetic Lz1/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:Lx1/n1;

.field public final synthetic p:La2/i;


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;Lx1/n1;La2/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/r;->n:Lz1/t$a;

    iput-object p2, p0, Lz1/r;->o:Lx1/n1;

    iput-object p3, p0, Lz1/r;->p:La2/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lz1/r;->n:Lz1/t$a;

    iget-object v1, p0, Lz1/r;->o:Lx1/n1;

    iget-object v2, p0, Lz1/r;->p:La2/i;

    invoke-static {v0, v1, v2}, Lz1/t$a;->e(Lz1/t$a;Lx1/n1;La2/i;)V

    return-void
.end method
