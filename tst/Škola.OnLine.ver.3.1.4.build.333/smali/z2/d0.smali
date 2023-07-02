.class public final synthetic Lz2/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz2/h0;


# direct methods
.method public synthetic constructor <init>(Lz2/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/d0;->n:Lz2/h0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz2/d0;->n:Lz2/h0;

    invoke-static {v0}, Lz2/h0;->v(Lz2/h0;)V

    return-void
.end method
