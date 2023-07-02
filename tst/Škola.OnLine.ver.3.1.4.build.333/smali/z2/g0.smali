.class public final synthetic Lz2/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz2/h0;

.field public final synthetic o:Lc2/b0;


# direct methods
.method public synthetic constructor <init>(Lz2/h0;Lc2/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/g0;->n:Lz2/h0;

    iput-object p2, p0, Lz2/g0;->o:Lc2/b0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz2/g0;->n:Lz2/h0;

    iget-object v1, p0, Lz2/g0;->o:Lc2/b0;

    invoke-static {v0, v1}, Lz2/h0;->x(Lz2/h0;Lc2/b0;)V

    return-void
.end method
