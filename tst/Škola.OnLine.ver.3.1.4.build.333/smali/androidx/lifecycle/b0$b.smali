.class public interface abstract Landroidx/lifecycle/b0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/lifecycle/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/lifecycle/b0$b$a;
    }
.end annotation


# static fields
.field public static final a:Landroidx/lifecycle/b0$b$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/lifecycle/b0$b$a;->a:Landroidx/lifecycle/b0$b$a;

    sput-object v0, Landroidx/lifecycle/b0$b;->a:Landroidx/lifecycle/b0$b$a;

    return-void
.end method


# virtual methods
.method public abstract a(Ljava/lang/Class;)Landroidx/lifecycle/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/a0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/Class;Ly/a;)Landroidx/lifecycle/a0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/a0;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ly/a;",
            ")TT;"
        }
    .end annotation
.end method
