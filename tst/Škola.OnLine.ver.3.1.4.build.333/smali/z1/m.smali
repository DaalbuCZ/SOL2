.class public final synthetic Lz1/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:La2/e;


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;La2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/m;->n:Lz1/t$a;

    iput-object p2, p0, Lz1/m;->o:La2/e;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/m;->n:Lz1/t$a;

    iget-object v1, p0, Lz1/m;->o:La2/e;

    invoke-static {v0, v1}, Lz1/t$a;->j(Lz1/t$a;La2/e;)V

    return-void
.end method
