.class public final synthetic Lw6/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp5/h;


# instance fields
.field public final synthetic a:Lp5/f0;


# direct methods
.method public synthetic constructor <init>(Lp5/f0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw6/c;->a:Lp5/f0;

    return-void
.end method


# virtual methods
.method public final a(Lp5/e;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lw6/c;->a:Lp5/f0;

    invoke-static {v0, p1}, Lcom/google/firebase/perf/FirebasePerfRegistrar;->b(Lp5/f0;Lp5/e;)Lw6/b;

    move-result-object p1

    return-object p1
.end method
