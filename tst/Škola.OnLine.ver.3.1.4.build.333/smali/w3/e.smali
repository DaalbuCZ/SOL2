.class public final synthetic Lw3/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lw3/f;


# direct methods
.method public synthetic constructor <init>(Lw3/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw3/e;->n:Lw3/f;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw3/e;->n:Lw3/f;

    invoke-static {v0}, Lw3/f;->a(Lw3/f;)V

    return-void
.end method
