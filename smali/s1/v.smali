.class public final synthetic Ls1/v;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La5/o;


# instance fields
.field public final synthetic n:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/v;->n:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/v;->n:Landroid/content/Context;

    invoke-static {v0}, Ls1/r$b;->c(Landroid/content/Context;)Ln3/c0;

    move-result-object v0

    return-object v0
.end method
