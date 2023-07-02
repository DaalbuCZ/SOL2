.class public final synthetic Ls1/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu1/b$a;


# instance fields
.field public final synthetic a:Ls1/s;


# direct methods
.method public synthetic constructor <init>(Ls1/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls1/j;->a:Ls1/s;

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ls1/j;->a:Ls1/s;

    invoke-static {v0}, Ls1/s;->i(Ls1/s;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
