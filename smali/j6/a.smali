.class public final synthetic Lj6/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Li6/b;


# instance fields
.field public final synthetic a:Lf5/e;


# direct methods
.method public synthetic constructor <init>(Lf5/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/a;->a:Lf5/e;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lj6/a;->a:Lf5/e;

    invoke-static {v0}, Lcom/google/firebase/installations/c;->c(Lf5/e;)Ll6/b;

    move-result-object v0

    return-object v0
.end method
