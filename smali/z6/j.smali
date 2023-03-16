.class public final synthetic Lz6/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz6/k;

.field public final synthetic o:Lz6/c;


# direct methods
.method public synthetic constructor <init>(Lz6/k;Lz6/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/j;->n:Lz6/k;

    iput-object p2, p0, Lz6/j;->o:Lz6/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz6/j;->n:Lz6/k;

    iget-object v1, p0, Lz6/j;->o:Lz6/c;

    invoke-static {v0, v1}, Lz6/k;->c(Lz6/k;Lz6/c;)V

    return-void
.end method
