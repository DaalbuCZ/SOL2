.class public final synthetic Lq5/d0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# instance fields
.field public final synthetic a:Lq5/e0;


# direct methods
.method public synthetic constructor <init>(Lq5/e0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq5/d0;->a:Lq5/e0;

    return-void
.end method


# virtual methods
.method public final a(Lt4/i;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lq5/d0;->a:Lq5/e0;

    invoke-static {v0, p1}, Lq5/e0;->a(Lq5/e0;Lt4/i;)Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
