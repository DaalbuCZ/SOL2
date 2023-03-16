.class public final synthetic Ly3/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ly3/g;


# direct methods
.method public synthetic constructor <init>(Ly3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly3/s;->n:Ly3/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly3/s;->n:Ly3/g;

    invoke-virtual {v0}, Ly3/g;->p()V

    return-void
.end method
