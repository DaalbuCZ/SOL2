.class public final synthetic Ld4/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ld4/g;


# direct methods
.method public synthetic constructor <init>(Ld4/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/s;->n:Ld4/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ld4/s;->n:Ld4/g;

    invoke-virtual {v0}, Ld4/g;->p()V

    return-void
.end method
