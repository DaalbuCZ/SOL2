.class public final synthetic Ln1/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ln1/w;


# direct methods
.method public synthetic constructor <init>(Ln1/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln1/u;->n:Ln1/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ln1/u;->n:Ln1/w;

    invoke-static {v0}, Ln1/w;->b(Ln1/w;)V

    return-void
.end method
