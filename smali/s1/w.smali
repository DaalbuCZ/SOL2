.class public final synthetic Ls1/w;
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

    iput-object p1, p0, Ls1/w;->n:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/w;->n:Landroid/content/Context;

    invoke-static {v0}, Ls1/r$b;->d(Landroid/content/Context;)Lu2/u$a;

    move-result-object v0

    return-object v0
.end method
