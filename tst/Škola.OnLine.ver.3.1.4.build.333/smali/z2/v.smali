.class public final synthetic Lz2/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz2/b0$a;

.field public final synthetic o:Lz2/b0;

.field public final synthetic p:Lz2/n;

.field public final synthetic q:Lz2/q;


# direct methods
.method public synthetic constructor <init>(Lz2/b0$a;Lz2/b0;Lz2/n;Lz2/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/v;->n:Lz2/b0$a;

    iput-object p2, p0, Lz2/v;->o:Lz2/b0;

    iput-object p3, p0, Lz2/v;->p:Lz2/n;

    iput-object p4, p0, Lz2/v;->q:Lz2/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lz2/v;->n:Lz2/b0$a;

    iget-object v1, p0, Lz2/v;->o:Lz2/b0;

    iget-object v2, p0, Lz2/v;->p:Lz2/n;

    iget-object v3, p0, Lz2/v;->q:Lz2/q;

    invoke-static {v0, v1, v2, v3}, Lz2/b0$a;->c(Lz2/b0$a;Lz2/b0;Lz2/n;Lz2/q;)V

    return-void
.end method
