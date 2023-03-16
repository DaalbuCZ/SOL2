.class public final synthetic Lz6/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz6/k;


# direct methods
.method public synthetic constructor <init>(Lz6/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/f;->n:Lz6/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lz6/f;->n:Lz6/k;

    invoke-static {v0}, Lz6/k;->d(Lz6/k;)V

    return-void
.end method
