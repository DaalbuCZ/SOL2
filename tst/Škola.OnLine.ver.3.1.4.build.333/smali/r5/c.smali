.class public final synthetic Lr5/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu5/b;


# instance fields
.field public final synthetic a:Lr5/d;


# direct methods
.method public synthetic constructor <init>(Lr5/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr5/c;->a:Lr5/d;

    return-void
.end method


# virtual methods
.method public final a(Lu5/a;)V
    .locals 1

    iget-object v0, p0, Lr5/c;->a:Lr5/d;

    invoke-static {v0, p1}, Lr5/d;->c(Lr5/d;Lu5/a;)V

    return-void
.end method
